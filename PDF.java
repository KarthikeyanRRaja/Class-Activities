/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.*;

/**
 *
 * @author Karthikeyan
 */
public class PDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Document document = new Document();
        try{
            PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
            document.open();
            Paragraph p1 = new Paragraph("Hello JAVA!");
            Paragraph p2 = new Paragraph("I am Karthikeyan.I am fan of you");
				document.add(p1);
            document.add(p2);
        }
        catch(Exception e){
            System.out.println(e);
        }
        document.close();
    }
    
}
