import { Routes } from '@angular/router';
import { HomeContigenciaComponent } from './components/home-contigencia/home-contigencia.component';

import { AyudaComponent } from './components/ayuda/ayuda.component';

export const ROUTES: Routes = [

    {path: 'ayuda', component: AyudaComponent},
    {path: 'homecontingencia', component: HomeContigenciaComponent},
    {path: '**', pathMatch: 'full', redirectTo: 'homecontingencia'}

]