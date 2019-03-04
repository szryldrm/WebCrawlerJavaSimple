/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcrawlerjavasimple;

/**
 *
 * @author sezeryildirim
 */
public class WebCrawlerJavaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.search("http://donanimhaber.com/", "bilgisayar");
    }
    
}
