package com.example.calculadora.service;

import com.example.calculadora.dto.CalculadoraRequestDTO;
import com.example.calculadora.dto.CalculadoraResponseDTO;

public interface CalcularCuotaService {
   CalculadoraResponseDTO calcularCuotas(CalculadoraRequestDTO request);
}
