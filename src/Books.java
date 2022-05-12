public class Books {
    private String title;
    private int pageNum;
    private int pubYear;

    public Books () {

    }
    public Books(String title) {
        this.title = title;
        this.pageNum = 0;
        this.pubYear = 0;
    }
    public Books(String title, int pageNum){
        this.title = title;
        this.pageNum = pageNum;
        this.pubYear = 0;
    }
    public Books(String title, int pageNum, int pubYear) {
        this.title = title;
        this.pageNum = pageNum;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getPubYear() {
        return pubYear;
    }

    public String toString(String info) {
            if (info.equalsIgnoreCase("everything")) {
                return getTitle() + ", " + getPageNum() + ", " + getPubYear();
            } else if (info.equalsIgnoreCase("name")) {
                return getTitle();
            }
           return null;
        }
    }

