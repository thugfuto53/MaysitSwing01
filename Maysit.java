import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Maysit extends Uri{
	public static void main(String[] args){
		Desktop desktop = Desktop.getDesktop();
        System.out.println("利用したいサービスを数字キーで選択し、Enterキーで決定してください。");
        System.out.println("0:GoogleChrome" + " " + "1:Youtube" + " " + "2:GoogleMap" + " " + "3:Googleカレンダー" + " " + "4:Gmail" + " " + "5:Chromeウェブストア" + " " + "6:Googleドライブ" + " " + "7:Googleスプレッドシート" + " " + "8:Googleドキュメント" + " " + "9:GitHub");
        int input = new java.util.Scanner(System.in).nextInt(10);
        if(input == 0){
		try{
			URI uri0 = new URI(uriString0);
			desktop.browse(uri0);
		}catch(URISyntaxException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
            }else if(input == 1){
                try{
                    URI uri1 = new URI(uriString1);
                    desktop.browse(uri1);
                }catch(URISyntaxException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }else if(input == 2){
                try{
                    URI uri2 = new URI(uriString2);
                    desktop.browse(uri2);
                }catch(URISyntaxException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }else if(input == 3){
                try{
                    URI uri3 = new URI(uriString3);
                    desktop.browse(uri3);
                }catch(URISyntaxException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }else if(input == 4){
                try{
                    URI uri4 = new URI(uriString4);
                    desktop.browse(uri4);
                }catch(URISyntaxException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }else if(input == 5){
                try{
                    URI uri5 = new URI(uriString5);
                    desktop.browse(uri5);
                }catch(URISyntaxException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }else if(input == 6){
                try{
                    URI uri6 = new URI(uriString6);
                    desktop.browse(uri6);
                }catch(URISyntaxException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }else if(input == 7){
                try{
                    URI uri7 = new URI(uriString7);
                    desktop.browse(uri7);
                }catch(URISyntaxException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }else if(input == 8){
                try{
                    URI uri8 = new URI(uriString8);
                    desktop.browse(uri8);
                }catch(URISyntaxException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }else if(input == 9){
                try{
                    URI uri9 = new URI(uriString9);
                    desktop.browse(uri9);
                }catch(URISyntaxException e){
                    e.printStackTrace();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
	}

}

