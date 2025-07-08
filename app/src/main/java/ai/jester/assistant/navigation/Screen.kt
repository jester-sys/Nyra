package ai.jester.assistant.navigation

sealed class Screen(val route:String){
    data object Splash : Screen("splash_screen")
    data  object StartChat : Screen("start_chat_screen")
    data  object Chat : Screen("chat_screen")
    data  object AiAssistants : Screen("ai_assistants_screen")
    data  object History : Screen("history_screen")
    data object Settings : Screen("settings_screen")
    data  object DeleteHistory : Screen("delete_history_screen")
    data object Languages : Screen("languages_screen")
    data object Logout : Screen("logout_screen")
    data object Upgrade : Screen("upgrade_screen")
}