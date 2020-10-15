import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {UserComponent} from './User/user.component';
import {PaceComponent} from './Pace/pace.component';
import { CommonModule } from '@angular/common';


const routes: Routes = [

  { path: 'users', component: UserComponent },
  { path: 'paces', component: PaceComponent },
];

@NgModule({
  declarations: [UserComponent,PaceComponent],
  imports: [RouterModule ,RouterModule.forRoot(routes),CommonModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
