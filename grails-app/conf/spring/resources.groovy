import com.hitsa.UserPasswordEncoderListener
import com.hitsa.CustomUserDetailsService

// Place your Spring DSL code here
beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    userDetailsService(CustomUserDetailsService)
}
