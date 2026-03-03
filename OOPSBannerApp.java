public class OOPSBannerApp {
    public static void main(String[] args) {

        // Array to hold OOPS banner lines
        String[] lines = {
            "   ***       ***      ******       ***** ",
            " **   **    **   **   **    **    **      ",
            "**     **  **     **  **     **  **       ",
            "**     **  **     **  **    **    **      ",
            "**     **  **     **  ******        ***   ",
            "**     **  **     **  **               ** ",
            "**     **  **     **  **                **",
            " **   **    **   **   **               ** ",
            "   ***        ***     **          *****   "
        };

        // Regular for loop
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }
}
