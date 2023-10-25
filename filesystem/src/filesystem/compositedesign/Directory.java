package filesystem.compositedesign;

import java.util.List;

public class Directory implements FileSystem {
	private String directoryName;
	private List<FileSystem> files;
	
	
	public Directory(String directoryName, List<FileSystem> files) {
		super();
		this.directoryName = directoryName;
		this.files = files;
	}


	@Override
	public void fs() {
		System.out.println(directoryName + " : ");
		for(FileSystem file: files) {
			file.fs();
		}
	}

}
