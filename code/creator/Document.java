package creator;

import java.util.ArrayList;

public class Document {

    private ArrayList<Page> pages;

    public Document() {
        this.pages = new ArrayList<Page>();
        addPage();
    }

    public void addPage(){
        pages.add(new Page());
    }
}
