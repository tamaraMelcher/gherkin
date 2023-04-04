package hellocucumber;

import io.cucumber.java.Before;
import io.cucumber.java.fr.*;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.fail;


public class StepDefinitionFrench {

    private int number, exponent;
    private String operation;

    private Calculator c;

    @Before
    public void resetMemoryBeforeEachScenario() {
        number = 0;
        exponent = 0;
        operation = "";
    }

    @Soit("J'ai initialisé la calculatrice")
    public void j_ai_initialisé_la_calculatrice() {
        c = new Calculator();
    }

    @Soit("Une opération sur les nombres {string}")
    public void une_opération_sur_les_nombres(String op) {
        switch (op) {
            case "^"	->	operation = "^";
            case "/"	->	operation = "/";
            default		->	fail();
        }
    }
    @Quand("Je fournis le numéro de base {int}")
    public void je_fournis_le_numéro_de_base(int base) {
        number = base;
    }

    @Donc("L'opération est évaluée à {int}")
    public void l_opération_est_évaluée_à(int result) {
        Assertions.assertEquals(result, c.root(number));
    }
}
