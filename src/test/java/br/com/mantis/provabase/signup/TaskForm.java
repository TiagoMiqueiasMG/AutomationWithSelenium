package br.com.mantis.provabase.signup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TaskForm {

    private WebDriver navegador;

    public TaskForm(WebDriver navegador) {
        this.navegador = navegador;
    }

    // Método para criar uma nova tarefa
    public void createTask() {

        // Abrir o sidebar e clicar em "Criar Tarefa"
        WebElement sidebar = navegador.findElement(By.id("sidebar"));
        WebElement criarTarefaLink = sidebar.findElement(By.xpath(".//span[contains(text(), 'Criar Tarefa')]"));
        criarTarefaLink.click();

        // Preencher campos obrigatórios do formulário
        // Preencher campo Categoria
        WebElement categoria = navegador.findElement(By.id("category_id"));
        Select selectCategoria = new Select(categoria);
        selectCategoria.selectByVisibleText("[Todos os Projetos] nova categoria");

        // Preencher "Resumo"
        WebElement resumo = navegador.findElement(By.id("summary"));
        resumo.sendKeys("Quarta Tarefa de Teste");

        // Preencher "Descrição"
        WebElement descricao = navegador.findElement(By.id("description"));
        descricao.sendKeys("Quarta Tarefa criada com finalidade de testar a aplicação de teste");

        // Clicar no botão "Criar Nova Tarefa"
        navegador.findElement(By.cssSelector("input[value='Criar Nova Tarefa']")).click();
    }

}
