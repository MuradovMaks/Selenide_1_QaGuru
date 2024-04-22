
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestFindGit
{
    @BeforeEach
    void setUp()
    {
        Configuration.browserSize="1920x1080";
    }
    @Test
    void GitFindTest()
    {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-body").$(".markdown-body").$("ul li:nth-child(8)").$("a").shouldHave(Condition.text("Soft assertions")).click();
        $("div:nth-child(18)").$("h4").shouldHave(Condition.text("3. Using JUnit5 extend test class:"));
        sleep(5000);
    }
}
