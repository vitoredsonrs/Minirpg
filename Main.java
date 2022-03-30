class Main {
  public static void main(String[] args){
    Player player01 = new Player("FoxTrot", 100, 10,10);

    /*Player player01 = new Player();*/
    
    String playerStatus = player01.exibirStatus();
    System.out.println(playerStatus);
    
  }
}