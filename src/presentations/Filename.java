package presentations;

public class Filename {


    //        final String FPATH = "/home/user/index.html";

  //           OutPut;

//            Extension = html
//            Filename = index
//            Path = /home/user

       private String fullPath;

       private char pathSeparator,
                                      extensionSeparator;

    public Filename(String fullPath, char pathSeparator, char extensionSeparator) {
        this.fullPath = fullPath;
        this.pathSeparator = pathSeparator;
        this.extensionSeparator = extensionSeparator;
    }

    public String extension(){
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot+1);
    }
    public String filename () {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep =fullPath.lastIndexOf(pathSeparator);
        return  fullPath.substring(sep +1 , dot);
    }
    public String path (){
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0,sep);
    }
}
