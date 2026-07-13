class Personagem{ 
    String nome;
    int hp;
    int forca;
    
    
    public Personagem(String nome, int hp , int forca)(
          this.nome = nome;
          this.hp = hp;
          this.forca= forca;
    )
    public void atacar(Personagem alvoPersonagem)(
        System.out.Prinln ("\n⚔️​" + this.nome + "ataca" +AlvoPersonagem.nome + "com forca de" + this.forca + "!");
    )
 
 alvoPersonagem.hp = alvoPersonagem.hp - this.forca;

 System.out.printLn("​🩸​" + alvoPersonagem.nome + "Perdeu" + this.force "+this.forca" de HP.) 
 
 
 }