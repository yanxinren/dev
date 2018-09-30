package com.ryx.others.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.convert.converter.Converter;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.stream.Collectors;

/**
 * @author ryx
 * @ProjectName demo
 * @Description:
 * @date 2018/9/25 002513:35
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article {

    private String title;
    private String author;
    private List<String> tags;

    /**
     * 方法功能描述: 准备参数
     *
     * @param:
     * @return:
     * @auther:
     * @date: 2018/9/25 0025 13:45
     */
    private static List<Article> getArticles() {
        ArrayList<Article> articles = new ArrayList<>();
        ArrayList<String> tags1 = new ArrayList<>();
        tags1.add("JAVA");
        tags1.add("JAVA");
        tags1.add("JAVA");
        tags1.add("Python");
        Article article1 = new Article();
        article1.setAuthor("张三");
        article1.setTitle("Java学习");
        article1.setTags(tags1);


        Article article2 = new Article();
        ArrayList<String> tags2 = new ArrayList<>();
        tags2.add("JAVA");
        tags2.add("C++");
        tags2.add("JAVA");
        tags2.add("Python");
        article2.setAuthor("李四");
        article2.setTitle("Python学习");
        article2.setTags(tags2);


        Article article3 = new Article();
        ArrayList<String> tags3 = new ArrayList<>();
        tags3.add("C++");
        tags3.add("C++");
        tags3.add("C++");
        tags3.add("Python");
        article3.setAuthor("李四");
        article3.setTitle("Python学习");
        article3.setTags(tags3);
        article3.setAuthor("李四");
        article3.setTitle("Go学习");
        article3.setTags(tags3);

        Article article4 = new Article();
        ArrayList<String> tags4 = new ArrayList<>();
        tags4.add("GO");
        tags4.add("GO");
        tags4.add("GO");
        tags4.add("Python");
        article4.setAuthor("李四");
        article4.setTitle("Python学习");
        article4.setTags(tags4);

        articles.add(article1);
        articles.add(article2);
        articles.add(article3);
        articles.add(article4);

        return articles;
    }

    /**
     * 方法功能描述: 迭代方式
     *
     * @param:
     * @return:
     * @auther:
     * @date: 2018/9/25 0025 13:49
     */
    public static Article getFirstJavaArticle() {
        List<Article> articles = getArticles();
        for (Article article : articles) {
            if (article.getTags().contains("Java")) {
                return article;
            }
        }
        return null;
    }

    /**
     * 方法功能描述: java 8 方式
     *
     * @param:
     * @return:
     * @auther:
     * @date: 2018/9/25 0025 13:51
     */
    public static Optional<Article> getFirstJavaArticleJava8() {
        List<Article> articles = getArticles();
        return articles.stream()
                .filter(article -> article.getTags().contains("JAVA"))
                .findFirst();
    }

    public static List<Article> getAllJavaArticles() {
        List<Article> articles = getArticles();
        return articles.stream()
                .filter(article -> article.getTags().contains("JAVA")).collect(Collectors.toList());
    }

    public static Map<String, List<Article>> groupByAuthor() {
        List<Article> articles = getArticles();
        Map<String, List<Article>> result = new HashMap<>();
        for (Article article : articles) {
            if (result.containsKey(article.getAuthor())) {
                result.get(article.getAuthor()).add(article);
            } else {
                ArrayList<Article> articles1 = new ArrayList<>();
                articles1.add(article);
                result.put(article.getAuthor(), articles1);
            }
        }

        return result;
    }

    /**
     * 方法功能描述: java 8 排序
     *
     * @param:
     * @return:
     * @auther:
     * @date: 2018/9/25 0025 14:38
     */
    public static Map<String, List<Article>> groupByAuthorJava8() {
        List<Article> articles = getArticles();
        System.out.println("-------------------------------");
        return articles.stream()
                .collect(Collectors.groupingBy(Article::getAuthor));
    }

    public Set<String> getDistinctTags() {
        List<Article> articles = getArticles();
        Set<String> result = new HashSet<>();
        for (Article article : articles) {
            result.addAll(article.getTags());
        }
        return result;
    }

    /**
     * 方法功能描述:  集合中所有不同的标签
     *
     * @param:
     * @return:
     * @auther:
     * @date: 2018/9/25 0025 14:41
     */
    public Set<String> getDistinctTagsJava8() {
        List<Article> articles = getArticles();
        return articles.stream()
                .flatMap(article -> article.getTags().stream())
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        Optional<Article> firstJavaArticleJava8 = getFirstJavaArticleJava8();
        List<Article> allJavaArticles = getAllJavaArticles();
        Map<String, List<Article>> stringListMap = groupByAuthorJava8();
        System.out.println("JAVA8查所有：" + allJavaArticles.toString());
        System.out.println("JAVA8：" + firstJavaArticleJava8.toString());


        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted); // 123
        PersonFactory<Person> personFactory = Person::new;
        Person creat = personFactory.creat("张三", "男", 18);
        System.out.println("可以利用接口实现简单工厂(实例化的person的值为)：" + creat);

        AtomicInteger atomicInteger = new AtomicInteger();

        //   AtomicReferenceArray
        //  filter 过滤

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
// "aaa2", "aaa1"


        /**
         * 删除集合中符合条件的成员，empty集合也可以，但是null就炸啦。
         */


    }


}
