programa {

    inclua biblioteca Util --> u

    funcao inicio() {

        inteiro vidaPlayer = 100
        inteiro ataquePlayer = 20
        inteiro curaPlayer = 25

        inteiro vidaEsqueleto = 80
        inteiro ataqueEsqueleto = 15

        inteiro nEscolha 

        escreva ("--- UM ESQUELETO APARECEU! ---\n")

        enquanto (vidaPlayer > 0 e vidaEsqueleto > 0)
        {
            escreva("\n------------------------------")
            escreva("\nSua Vida: ", vidaPlayer)
            escreva("\nVida do Esqueleto: ", vidaEsqueleto)
            escreva("\n------------------------------")
            escreva("\nEscolha sua ação:")
            escreva("\n1) Atacar")
            escreva("\n2) Curar")
            escreva("\nOpção: ")
            leia (nEscolha)

            se (nEscolha == 1) 
            {
                vidaEsqueleto = vidaEsqueleto - ataquePlayer
                escreva("\nVocê atacou o esqueleto!\n")
            }
            senao se (nEscolha == 2)
            {
                vidaPlayer = vidaPlayer + curaPlayer

                se (vidaPlayer > 100) 
                { 
                    vidaPlayer = 100
                }

                escreva ("\nVocê se curou!\n")
            }
            senao 
            {
                escreva ("\nEscolha inválida!\n")
            }

            // ataque do esqueleto (se ainda estiver vivo)
            se (vidaEsqueleto > 0) 
            {
                vidaPlayer = vidaPlayer - ataqueEsqueleto
                escreva ("O esqueleto atacou você\n")
            }

            u.aguarde(1000)
        }

        // resultado final correto
        se (vidaPlayer <= 0)
        {
            escreva ("\nVOCÊ FOI DERROTADO!")
        }
        senao se (vidaEsqueleto <= 0)
        {
            escreva ("\nVOCÊ VENCEU! O esqueleto foi derrotado.")
        }
    }
}
