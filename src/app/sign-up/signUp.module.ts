import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SignUpComponent } from './sign-up.component';
import { FormsModule } from '@angular/forms';
import { SignUpRoutingModule } from './signUp-routing.module';

/**
 * Questo modulo serve unicamente Login e Registrazione (non implementata)
 * Importa il suo modulo di routing
 * 
 * @author Vittorio Valent
 */
@NgModule({
  declarations: [SignUpComponent],

  imports: [
    CommonModule,
    SignUpRoutingModule,
    FormsModule
    ]
})
export class SignUpModule { }
