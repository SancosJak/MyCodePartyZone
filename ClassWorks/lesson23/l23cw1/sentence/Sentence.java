package sentence;

//Подсчитать количество слов и букв в самом длинном в мире предложении:
public class Sentence {

    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public  int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        int wordsQTY = words.length;
        System.out.println("There are " + wordsQTY + " in text");
       return wordsQTY;
       //return words.length;
    }

    public int countLetters(String sentence) {
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        System.out.println("There are " + count + " in text");
        return count;
    }
    /*
    public static void main(String[] args) {
        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";

        int wordCount = countWords(sentence);
        int letterCount = countLetters(sentence);
        int symbolCount = sentence.length();

        System.out.println("Quantity of words: " + wordCount);
        System.out.println("Quantity of letters: " + letterCount);
        System.out.println("Number of all characters (including spaces) : " + symbolCount);
    }

     */
}
