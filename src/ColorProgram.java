import java.util.ArrayList;

public class ColorProgram {
    public static void main(String[] args) {
        ArrayList<Color> colors = new ArrayList<>();
        
        colors.add(new Color("red", 255, 0, 0));
        colors.add(new Color("blue", 0, 0, 255));
        colors.add(new Color("black", 0, 0, 0));
        colors.add(new Color("white", 255, 255, 255));

        Color green = new Color("green", 0, 255, 0);
        colors.add(green);

//        System.out.println(colors.get(2));

//        for (Color c : colors) {
//            System.out.println(c);
//        }

        int minR = 255;
        String name = "";
        for (Color c : colors) {
              if (c.getR() < minR){
                minR = c.getR();
                name = c.getName();
            }
        }
        System.out.println("Minimum Red Color: " + name);

        System.out.println(colors.indexOf(green));
        System.out.println(colors.indexOf(new Color("magenta", 1, 1, 1)));

        System.out.println(colors.contains(green));

    }
}






