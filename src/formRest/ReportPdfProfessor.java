package formRest;

import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


public class ReportPdfProfessor {
    public String FILE = "FirstPdf.pdf";
    public Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    public Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    public Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    public Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);


    // iText allows to add metadata to the PDF which can be viewed in your Adobe
    // Reader
    // under File -> Properties
    public void addMetaData(Document document) {
        document.addTitle("Report Professor");
        document.addSubject("Using iText");
        document.addKeywords("Java, PDF, iText");
        document.addAuthor("Lars Vogel");
        document.addCreator("Lars Vogel");
    }


    public void addContent(Document document) throws DocumentException {
        Anchor anchor = new Anchor("Listado de Catedráticos", catFont);
        anchor.setName("Listado de Catedráticos");

        // Second parameter is the number of the chapter
        Chapter catPart = new Chapter(new Paragraph(anchor), 1);

        Paragraph subPara = new Paragraph("\n", subFont);
        Section subCatPart = catPart.addSection(subPara);


        // add a table
        createTable(subCatPart);

        // now add all this to the document
        document.add(catPart);

        // Next section
        anchor = new Anchor("Second Chapter", catFont);
        anchor.setName("Second Chapter");

        // Second parameter is the number of the chapter
        catPart = new Chapter(new Paragraph(anchor), 1);

        subPara = new Paragraph("Subcategory", subFont);
        subCatPart = catPart.addSection(subPara);
        subCatPart.add(new Paragraph("This is a very important message"));

        // now add all this to the document
        document.add(catPart);

    }

    public void createTable(Section subCatPart)
            throws BadElementException {
        PdfPTable table = new PdfPTable(5);

        // t.setBorderColor(BaseColor.GRAY);
        // t.setPadding(4);
        // t.setSpacing(4);
        // t.setBorderWidth(1);

        PdfPCell c1 = new PdfPCell(new Phrase("ID personal"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("CUI"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Nombre"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        
        c1 = new PdfPCell(new Phrase("Apellido"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        
        c1 = new PdfPCell(new Phrase("Fecha de Nacimiento"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);
        
        table.setHeaderRows(1);
        
                        try{
            java.util.List<Professor> res=null;// = new ArrayList<>();
            //Object e = wsC.listacurso();
        ProfessorRest cr = new ProfessorRest();
        res = cr.dumpJSONElementCatedraticos(cr.catedraticoget(),res);
            
            //res = (List<Curso>) wsC.listacurso();
            //obtener listado catedraticos
            if(res == null){
                JOptionPane.showMessageDialog(null, "No existen Datos..", "Listar Catedráticos", JOptionPane.ERROR_MESSAGE);
            }
  
            for (int i = 0; i < res.size(); i++) {
                table.addCell(String.valueOf(res.get(i).id_profesor));
                table.addCell(String.valueOf(res.get(i).cui));
                table.addCell(String.valueOf(res.get(i).nombre));
                table.addCell(String.valueOf(res.get(i).apellido));
                table.addCell(String.valueOf(res.get(i).fechanac));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error..", "Listar Catedráticos", JOptionPane.ERROR_MESSAGE);
        }

        subCatPart.add(table);

    }

}