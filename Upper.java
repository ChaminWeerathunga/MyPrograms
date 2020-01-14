public class Upper {
    public static void main(String args[]) {
BufferedReader br1 = new BufferedReader(new FileReader("names.txt"));
    String phrase = "";
    String rline;

    while ((rline = br1.readLine()) != null) {
        phrase = rline;
        char[] line = phrase.toCharArray();
        for (r = 0; r < line.length; r++) {
            if (line[r] == ' ' && line[r] == ',' && line[r] != '.') {
                line[r + 1] = Character.toUpperCase(line[r + 1]);
            }
            output = Character.toString(line[r]);
            System.out.print(output);
        }
        System.out.println();

    }
    br1.close();
}
}
