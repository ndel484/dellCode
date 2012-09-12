

public class splashSwitcher {

	public static void main(String[] args) {
		int currentDefaultIndex;
		theSwitch aSwitch = new theSwitch();
		
		currentDefaultIndex =aSwitch.checkForDefault();
		aSwitch.renameAllByIndex(1);
		
		//aSwitch.renameToBackgroundDefault(0);
		if (currentDefaultIndex>-1){
		//	aSwitch.renameFromBackgroundDefault(currentDefaultIndex, "zzz.jpg");
		//	aSwitch.renameAllByIndex(0);
		//	aSwitch.renameToBackgroundDefault(0);
		//	aSwitch.renameAllByIndex(1);
		}else{
		//	aSwitch.renameAllByIndex(0);
		//	aSwitch.renameToBackgroundDefault(aSwitch.refreshFileList().length-1);
		}
		
		
	}
}