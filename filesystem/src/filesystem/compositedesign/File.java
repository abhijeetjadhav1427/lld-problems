package filesystem.compositedesign;

public class File implements FileSystem {
	private String fileName;
	
	public File(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void fs() {
		// TODO Auto-generated method stub
		System.out.println(fileName);
	}
	
}
