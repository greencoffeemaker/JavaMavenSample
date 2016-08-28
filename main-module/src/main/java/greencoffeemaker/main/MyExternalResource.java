package greencoffeemaker.main;

public class MyExternalResource extends MyResource {

	@Override
	protected String getResourcePath() {
		return "myexternal.properties";
	}
}
