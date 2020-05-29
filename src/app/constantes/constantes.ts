export const constantes = {
    productos: [
                {
                    nombre: 'Gama Básica',
                    valor: 4818000
                },
                {
                    nombre: 'Gama Confort',
                    valor: 9730000
                },
                {
                    nombre: 'Gama Advance',
                    valor: 12100000
                },
                {
                    nombre: 'Gama Premium',
                    valor: 19600000
                }
                ],
    tasa: 0.181,
    periodoGracia: 2,
    periodos: ['06', '12', '18', '24', '36'],
    condiciones: {
        uno: {
            titulo: 'Condiciones para el cliente:',
            contenido: [
                'Debe tener entre 18 y 75 años',
                'Ganar más de un salario mínimo',
                'El monto mínimo es $800.000',
                'El monto máximo es $20.000.000',
                'Colombiano o residente con visa e historia laboral',
                'Plazo de financiación máximo 12 meses adicionales a la duración del tratamiento'
            ]
        },
        dos: {
            titulo: 'Clientes asalariados:',
            contenido: [
                'Continuidad laboral mínima de 12 meses.'
            ]
        },
        tres: {
            titulo: 'Clientes independientes:',
            contenido: [
                'Antigüedad en la actividad mínima de 12 meses'
            ]
        }
    },
    constanteSeguro: 1200 / 1000000,
    constanteCuatroPorMil: 4 / 1000,
    minDes: 0,
    maxDes: 10,
    ctaminDes: 0,
    ctamaxDes: 70
};