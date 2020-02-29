import { NgModule } from '@angular/core';
import { MatDialogModule,
         MatButtonModule,
         MatTabsModule,
         MatStepperModule,
         MatFormFieldModule,
         MatInputModule,
         MatGridListModule,
         MatSelectModule,
         MatCheckboxModule,
         MatProgressSpinnerModule,
         MatDatepickerModule,
         MatNativeDateModule,
         MatSnackBarModule,
         MatIconModule,
         MatRadioModule } from '@angular/material';

const MaterialComponents = [
    MatGridListModule,
    MatButtonModule,
    MatTabsModule,
    MatStepperModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatCheckboxModule,
    MatButtonModule,
    MatProgressSpinnerModule,
    MatDialogModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatSnackBarModule,
    MatIconModule,
    MatRadioModule
];

@NgModule({
        imports: [MaterialComponents],
        exports: [MaterialComponents]
        })
export class MaterialModule {}