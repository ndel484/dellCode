

public class splashSwitcher {

	public static void main(String[] args) {
		int currentDefaultIndex;
		theSwitch aSwitch = new theSwitch();
		
		currentDefaultIndex =aSwitch.checkForDefault();

		if (currentDefaultIndex>-1){
			aSwitch.checkFileSizes();
			aSwitch.renameFromBackgroundDefault(currentDefaultIndex, "zzz.jpg");
			aSwitch.renameAllByIndex(0);
			aSwitch.renameToBackgroundDefault(0);
			aSwitch.renameAllByIndex(1);
		}else{
			aSwitch.renameAllByIndex(0);
			aSwitch.renameToBackgroundDefault(aSwitch.refreshFileList().length-1);
		}
		
		
	}
}