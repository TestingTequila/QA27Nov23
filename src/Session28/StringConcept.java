package Session28;

public class StringConcept
{
    public static void main(String[] args) {
        String name = "  Jason";
        name.concat("Roger");
        System.out.println(name);// Jason

        System.out.println("====================================Handling String Immutability===============");
        StringBuffer sb = new StringBuffer("  Jason");
        sb.append("Roger");
        System.out.println(sb);// JasonRoger


    }
}
