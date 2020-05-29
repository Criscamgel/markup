import { Routes } from '@angular/router';
import { HomeConInteresComponent } from './components/home-con-interes/home-con-interes.component';
import { HomeSinInteresComponent } from './components/home-sin-interes/home-sin-interes.component';
import { HomeContigenciaComponent } from './components/home-contigencia/home-contigencia.component';

import { AyudaComponent } from './components/ayuda/ayuda.component';

export const ROUTES: Routes = [

    {path: 'ayuda', component: AyudaComponent},
    {path: 'homeconinteres', component: HomeConInteresComponent},
    {path: 'homesininteres', component: HomeSinInteresComponent},
    {path: 'homecontingencia', component: HomeContigenciaComponent},
    {path: '**', pathMatch: 'full', redirectTo: 'homecontingencia'}

]