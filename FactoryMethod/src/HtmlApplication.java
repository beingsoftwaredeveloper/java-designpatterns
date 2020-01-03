
public class HtmlApplication extends Application {

	@Override
	public Document createDocument() {
		return new HtmlDocument();
	}

	@Override
	public View createView() {
		// TODO Auto-generated method stub
		return new HtmlView();
	}

}
