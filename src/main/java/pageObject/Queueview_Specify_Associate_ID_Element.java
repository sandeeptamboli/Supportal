package pageObject;

public interface Queueview_Specify_Associate_ID_Element {
	String chevronright = "//button[@id='changePerspectiveBTN']";
    String SpecifyAssociate = "//*[@id='QV_AUX_List_Items']/ul[1]/li[4]";
    String Set_QueueView_Perspective = "//span[contains(text(),'Set QueueView Perspective')]";
    String Select_Associate = "//span[@id='select2-chosen-1']";
    String Search_Associate = "//input[@id='s2id_autogen1_search']";
    String Associate = "//ul[@id='select2-results-1']";
    String Load_Associate = "//button[@id='bot2-Msg1']";
    String ticketNumber = "//*[@id='QV_GRID']/tbody/tr[1]/td[2]";
    String Owner = "//*[@id='IV_GROUP_INFO']/table/tbody/tr[1]/td[2]/a/span";
}
