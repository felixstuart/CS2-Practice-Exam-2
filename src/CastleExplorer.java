public class CastleExplorer {

    private String ancientRunes = "z%nxt#%lh#@wsife#w#qr$mt*h!lho#gr&tw#sxrk^o#wl#tvqu!mf#*pzl#i#e!ksv#fe*$sioe#s#i#pmn#?*wt#bh#rzfhwie#xf#jntxo#h%nr#fue#*!orzs#jst#^*@";

    private Dragon[] dragons = new Dragon[50];


    public static void main(String[] args) {
        CastleExplorer castleExplorer = new CastleExplorer();

    }

    public CastleExplorer() {
        System.out.println("Welcome, brave night! May your code be as strong as your sword!");

        for (int i = 0; i < dragons.length; i++) {
            dragons[i] = new Dragon((int) (Math.random()*91)+10, (int) (Math.random()*451)+50);
        }
        displayDragons();
        System.out.println(checkFirePower());
        System.out.println(decipher(ancientRunes));
    }

    public void displayDragons() {
        for (Dragon dragon : dragons) {
            dragon.printInfo();
        }
    }

    public boolean checkFirePower() {
        boolean[] firepowers = new boolean[91];
        for (Dragon dragon : dragons) {
            if (firepowers[dragon.getFirePower()-10]) {
                return true;
            } else {
                firepowers[dragon.getFirePower()-10] = true;
            }
        }
        return false;
    }

    public String decipher(String ancientRunes) {
        String english = "";
        while(ancientRunes.contains("#")) {
            int index = ancientRunes.indexOf("#");
            english += ancientRunes.substring(index-1, index);
            ancientRunes = ancientRunes.substring(index+1);
        }
        return english;
    }
}