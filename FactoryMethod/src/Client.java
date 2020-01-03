
public class Client {

	public static void main(String[] args) {

		// html application
		HtmlApplication htmlApp = new HtmlApplication();
		Document htmlDoc = htmlApp.onNewDocument();
		View htmlView = htmlApp.onNewView();
		htmlDoc.open();
		htmlDoc.save("htmlDoc");
		htmlView.draw();
		htmlDoc.close();

		// pdf application
		
		PdfApplication pdfApp = new PdfApplication();
		Document pdfDoc = pdfApp.onNewDocument();
		View pdfView = pdfApp.onNewView();
		pdfDoc.open();
		pdfDoc.save("pdfDoc");
		pdfView.draw();
		pdfDoc.close();
		
	}

}
