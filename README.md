# 🚗 API Tabela Fipe

Uma aplicação Java Spring Boot que consulta a Tabela FIPE oficial para obter informações sobre veículos, incluindo carros, motos e caminhões.

## 📋 Descrição

Esta aplicação consome a API pública da Tabela FIPE para fornecer informações atualizadas sobre:
- **Marcas de veículos**
- **Modelos por marca** 
- **Detalhes completos dos veículos** (valor, ano, combustível, etc.)

## 🛠 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Jackson** (para serialização/desserialização JSON)
- **Java HttpClient** (para consumo de APIs)
- **Maven** (gerenciamento de dependências)


## 🔧 Funcionalidades

### ✅ Implementadas
- [x] Consulta de marcas por tipo de veículo (carros, motos, caminhões)
- [x] Listagem de modelos por marca
- [x] Filtro de modelos por nome
- [x] Consulta detalhada de veículos por modelo e ano
- [x] Exibição de informações completas do veículo

### 🚀 Funcionalidades Futuras
- [ ] Persistência em banco de dados
- [ ] Interface web
- [ ] Histórico de consultas
- [ ] Comparação entre veículos

## 🎯 Como Usar

1. **Execute a aplicação:**
   ```bash
   ./mvnw spring-boot:run

## 📊 Exemplo de Saída

- Carro
- Moto 
- Caminhão 

Digite uma das opções para consultar: carro

1 - Acura
2 - Agrale
3 - Alfa Romeo
...

Informe o código da marca para consulta: 6

Modelos dessa marca:

1 - A1
2 - A3
3 - Q3
...

Digite o nome do carro a ser buscado: A3

modelosFiltrados
2 - A3 Sportback

Digite por favor o tipo de Modelo: 2

Todos os veiculos Filtrados por Ano
Veiculo[valor=R$ 125.990, marca=Audi, modelo=A3 Sportback, ano=2022, combustivel=Gasolina]
Veiculo[valor=R$ 130.500, marca=Audi, modelo=A3 Sportback, ano=2023, combustivel=Gasolina]

## 🔗 API Utilizada

- Base URL: https://parallelum.com.br/fipe/api/v1/

- Fonte: Tabela FIPE Oficial

## 📝 Modelos de Dados

**Dados**
Representa informações básicas com código e nome

```record Dados(String codigo, String nome)```

**Modelos**
Contém lista de modelos de veículos

```record Modelos(List<Dados> modelos) ```

**Veiculo**
Representa um veículo com todas as informações

```record Veiculo(String valor, String marca, String modelo, Integer ano, String combustivel)```

## 🏃‍♂️ Executando o Projeto

**Pré-requisitos**
- Java 17 ou superior
- Maven 3.6+

   
