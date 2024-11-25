# MV Cuts - Barber Shop App

MV Cuts é um aplicativo de barbearia que permite aos usuários agendar serviços de corte de cabelo, barba e outros serviços relacionados. O aplicativo permite que os usuários visualizem os barbeiros disponíveis, seus horários e agendem compromissos de forma prática e eficiente.

## Funcionalidades

- **Login de Usuário**: Usuários podem criar uma conta ou fazer login usando suas credenciais.
- **Agendamento de Serviços**: Agende horários com barbeiros disponíveis para corte de cabelo, barba e outros serviços.
- **Visualização de Perfil**: Exibição e edição do perfil do usuário, incluindo informações pessoais e histórico de agendamentos.
- **Barbeiros**: Listagem de barbeiros disponíveis, incluindo fotos, especialidades, avaliações e horários disponíveis.
- **Notificações**: O usuário recebe notificações de confirmação de agendamento e outras atualizações importantes.

## Tecnologias Utilizadas

- **Android**: Desenvolvimento do aplicativo móvel utilizando a plataforma Android.
- **Java**: Linguagem de programação principal para desenvolvimento do app.
- **Firebase**: Autenticação de usuários e armazenamento de dados.
- **SQLite**: Banco de dados local para armazenamento de informações do usuário e agendamentos.

## Estrutura do Projeto

- **app/src/main/java/com/mvcuts**: Contém o código-fonte principal do aplicativo.
  - **ui**: Pastas com atividades (Activity) e fragmentos (Fragment) do aplicativo.
  - **model**: Classes que representam os dados do aplicativo (usuários, barbeiros, agendamentos).
  - **viewmodel**: ViewModels para gerenciamento de dados e lógica de UI.
  - **adapter**: Adaptadores para RecyclerViews e ListViews.
- **app/src/main/res/layout**: Contém os arquivos XML para as telas e layouts do aplicativo.
- **app/src/main/res/values**: Definições de cores, strings, dimensões e estilos do aplicativo.
- **app/src/main/res/drawable**: Recursos gráficos, como ícones e imagens.

## Como Rodar o Projeto

1. **Clonar o repositório**:
   ```bash
   git clone https://github.com/username/mv-cuts.git
