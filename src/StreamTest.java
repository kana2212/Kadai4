
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {

        List<String> names = List.of("midoriya", "bakugou", "todoroki", "midoriya", "iida");

        System.out.println("◎キャラクター一覧");
        System.out.println(names);
        System.out.println("----------");

        List<String> distinct = names.stream().distinct().toList();
        System.out.println("重複箇所は排除");
        System.out.println(distinct);
        System.out.println("----------");

        List<String> sortedResult = names.stream().sorted().toList();
        System.out.println("アルファベット順");
        System.out.println(sortedResult.stream().distinct().toList());
        System.out.println("----------");

        List<String> filter = names.stream().filter(name -> name.contains("b")).toList();
        System.out.println("bを含む名前のみ表示");
        filter.forEach(System.out::println);
        System.out.println("----------");


    }


}

