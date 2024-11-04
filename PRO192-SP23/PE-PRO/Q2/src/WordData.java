public class WordData extends Factory implements IConnect{
    String content;

    public WordData(String type, String dataSoucre) {
        super(type, dataSoucre);
    }

    @Override
    public boolean makeConnection() {
        if(this.getDataSoucre().contains("localhost:8080")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void readData() {
        if(this.getType().endsWith(".doc")){
            this.content = "humpty dumpty sat on the wall";
        }else{
            System.out.println("This Is A String");
        }
    }
    
    public static String toTitleCase(String input){
        StringBuilder titleCase = new StringBuilder(input.length());
        boolean nextTitleCase = true;
        for(char c: input.toCharArray()){
            if(Character.isSpaceChar(c)){
                nextTitleCase = true;
            }else if(nextTitleCase){
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }
        
        return titleCase.toString();
    }
    
    @Override
    public String writeData() {
        this.content = toTitleCase(content);
        return content;
    }
    
    
}
