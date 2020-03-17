import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { UserDashboardComponent } from './user-dashboard.component';
import {UserDashboardRoutingModule} from './user-dashboard-routing.module';
import { FormsModule } from '@angular/forms';

/**
 * Questo modulo serve unicamente Login e Registrazione (non implementata)
 * Importa il suo modulo di routing
 * 
 * @author Vittorio Valent
 */
@NgModule({
  declarations:  [UserDashboardComponent],

  imports: [
    CommonModule,
    UserDashboardRoutingModule,
    FormsModule
  ]
  
})
export class UserDashboardModule { }
