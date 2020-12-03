package tests.lesson7;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexPullRequestTests {

    @Test
    void YandexSearchTest() {
        open("https://yandex.ru/");

        $("#text").val("Selenide").submit();

        $("body").shouldHave(Condition.text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
