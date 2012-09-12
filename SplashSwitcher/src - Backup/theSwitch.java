import java.io.*;
public class theSwitch {
	String absolutePath = "C:\\Windows\\System32\\oobe\\Info\\backgrounds\\";
	public File[] refreshFileList() {
		File[] fileList = new File(absolutePath).listFiles();
		return fileList;
	}
	public int checkForDefault() {
		File[] fileList = refreshFileList();
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].getName().equals("backgroundDefault.jpg"))
				return i;
		}
		return -1;
	}
	public void renameFromBackgroundDefault(int currentDefaultIndex, String newName) {
		File[] fileList = refreshFileList();
		fileList[currentDefaultIndex].renameTo(new File(absolutePath + newName));
	}
	public void renameAllByIndex(int exceptLast) {
		File[] fileList =  refreshFileList();
		for (int i = 0; i < fileList.length - exceptLast; i++) {
			System.out.println(fileList[i]+" index is equal to "+i);
		}
	/*	for (int i = 0; i < fileList.length - exceptLast; i++) {
			fileList[i].renameTo(new File(absolutePath + i+ ".jpg"));
		//	System.out.println(fileList[i]+"Renaming fileList ["+i+"] to "+i+".jpg" );
		}*/
	}
	public void renameToBackgroundDefault(int indexToRename) {
		File[] fileList =  refreshFileList();
		fileList[indexToRename].renameTo(new File(absolutePath+ "backgroundDefault.jpg"));
	}
}
