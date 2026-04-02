programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		// Atributos do Jogador
		inteiro vidaPlayer = 100
		inteiro ataquePlayer = 20
		inteiro curaPlayer = 25

		// Atributos do Esqueleto
		inteiro vidaEsqueleto = 80
		inteiro ataqueEsqueleto = 15

		inteiro escolha

		escreva("--- UM ESQUELETO APARECEU! ---\n")

		// Loop de Combate
		enquanto(vidaPlayer > 0 e vidaEsqueleto > 0)
		{
			escreva("\n------------------------------")
			escreva("\nSua Vida: ", vidaPlayer)
			escreva("\nVida do Esqueleto: ", vidaEsqueleto)
			escreva("\n------------------------------")
			escreva("\nEscolha sua ação:")
			escreva("\n1) Atacar")
			escreva("\n2) Curar")
			escreva("\nOpção: ")
			leia(escolha)

			limpa()

			// Turno do Jogador
			se(escolha == 1)
			{
				escreva("Você golpeia o esqueleto com sua espada!\n")
				vidaEsqueleto = vidaEsqueleto - ataquePlayer
				escreva("Dano causado: ", ataquePlayer, "\n")
			}
			senao se(escolha == 2)
			{
				escreva("Você usa uma poção mágica!\n")
				vidaPlayer = vidaPlayer + curaPlayer
				escreva("Você recuperou ", curaPlayer, " de vida!\n")
			}
			senao
			{
				escreva("Você ficou confuso e perdeu a vez!\n")
			}

			// Verifica se o esqueleto morreu antes de ele atacar
			se(vidaEsqueleto > 0)
			{
				// Turno do Esqueleto
				escreva("\nO Esqueleto range os dentes e ataca!\n")
				u.aguarde(1000) // Pausa de 1 segundo para dar emoção
				vidaPlayer = vidaPlayer - ataqueEsqueleto
				escreva("Você recebeu ", ataqueEsqueleto, " de dano!\n")
			}
		}

		// Resultado Final
		escreva("\n==============================")
		se(vidaPlayer > 0)
		{
			escreva("\nVITÓRIA! O esqueleto virou pó!")
		}
		senao
		{
			escreva("\nDERROTA... Você sucumbiu às trevas.")
		}
		escreva("\n==============================\n")
	}
}