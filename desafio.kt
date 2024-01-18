enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

class Usuario (val name: String)

data class ConteudoEducacional(var name: String, val duracao: Int = 60)

data class Formacao(val name: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
     
    fun matricular(usuario: Usuario) {
         inscritos.add(usuario)
      println("${usuario.name} foi registrado com sucesso na formação $name")
      
        
    }
}

fun main() {
    //Cursos
    val angular = ConteudoEducacional("Angular iniciante", 50)
    val kotlin = ConteudoEducacional("Kotlin Iniciante", 60)
    val chatgpt = ConteudoEducacional("ChatGpt Básico", 40)
    
    //Formação 
    val formacaoAngular = Formacao("Formação Angular", listOf(angular))
    val formacaoKotlin = Formacao("Formação Kotlin", listOf(kotlin))
    val formacaoChatGpt = Formacao("Formação ChatGpt", listOf(chatgpt))
    //Usuários
   		val pedro = Usuario("Pedro")
        val tainara = Usuario("Tainara")
        val paulo = Usuario("Paulo")
        
    //Registro das matriculas usuario
       formacaoAngular.matricular(pedro)
	   formacaoKotlin.matricular(tainara)
       formacaoChatGpt.matricular(paulo)

   //Análise do registros iscritos na formação
   println("Inscritos na formação Angular: ${formacaoAngular.inscritos.map { it.name }}")
   println("Inscritos na formação Kotlin: ${formacaoKotlin.inscritos.map { it.name }}")
   println("Inscritos na formação ChatGpt: ${formacaoChatGpt.inscritos.map { it.name }}")
