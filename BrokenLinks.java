 public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new FirefoxDriver();
   driver.get("https://www.xyz.com/");
   Thread.sleep(6000L);
   int size = driver.findElements(By.tagName("a")).size();

   System.out.println(size);

   List<String> Linkarray = new ArrayList<String>();

       List<WebElement> Linklist = driver.findElements(By.tagName("a"));

       for (WebElement link : Linklist) {

        String links = link.getText();
        Linkarray.add(links );

       }
       for (String linkToTest : Linkarray){
        driver.findElement(By.linkText(linkToTest)).click();
        Thread.sleep(15000L);
     if(driver.getTitle().contains("Problem")) {
      System.out.println("Fail");
     }
     else
     {
      System.out.println("pass");
     }
     driver.navigate().back();
     Thread.sleep(5000L);
    }

   driver.close();

}
}

