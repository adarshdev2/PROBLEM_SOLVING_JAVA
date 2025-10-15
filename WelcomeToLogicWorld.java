// 🌟 WelcomeToLogicWorld.java
// A fun and creative intro file for your GitHub problem-solving repository.
// Made to inspire curiosity, logic, and fun while coding in Java! ☕

public class WelcomeToLogicWorld {

    public static void main(String[] args) throws InterruptedException {
        String title = "\n🧠 WELCOME TO THE LOGIC WORLD OF JAVA 🧠\n";
        String message = """
                ---------------------------------------------
                🚀 Repository Mission:
                To explore, think curious, and solve logical problems
                with creativity — powered by Java Programming 💻
                ---------------------------------------------
                """;

        printSlow(title, 60);
        printSlow(message, 40);

        String[] quotes = {
            "“Code is like humor. When you have to explain it, it’s bad.” – Cory House",
            "“Java: Write once, debug everywhere!” 😄",
            "“Logic will get you from A to B. Imagination will take you everywhere.” – Einstein",
            "“A curious mind and a clean syntax can solve any problem.”"
        };

        printSlow("✨ Random Thought for Today ✨\n", 50);
        Thread.sleep(500);
        int index = (int)(Math.random() * quotes.length);
        printSlow("💬 " + quotes[index] + "\n\n", 35);

        printSlow("🧩 Explore problems → Learn logic → Build creativity\n", 45);
        printSlow("🔥 Let’s begin your journey of logical mastery in Java!\n", 40);

        System.out.println("\n🔗 Repository by: Adarsh *^* ");
        System.out.println("🌐 Visit: github.com/your-username\n");
    }

    // ✨ Helper function to print text with a typing effect
    private static void printSlow(String text, int delay) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(delay / 2);
        }
    }
}
