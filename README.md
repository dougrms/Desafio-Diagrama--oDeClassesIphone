## POO - Desafio


```mermaid
classDiagram
    class ReprodutorMusical{
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +atender()
        +ligar(String numero)
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +adicionarNovaAba()
        +atualizarPagina()
        +exibirPagina(String url)
    }

    class iPhone {

    }
    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
