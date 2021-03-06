USE [master]
GO
/****** Object:  Database [PostoGasolina]    Script Date: 21/11/2019 17:27:52 ******/
CREATE DATABASE [PostoGasolina]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'PostoGasolina', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\PostoGasolina.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'PostoGasolina_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.MSSQLSERVER\MSSQL\DATA\PostoGasolina_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [PostoGasolina] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [PostoGasolina].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [PostoGasolina] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [PostoGasolina] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [PostoGasolina] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [PostoGasolina] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [PostoGasolina] SET ARITHABORT OFF 
GO
ALTER DATABASE [PostoGasolina] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [PostoGasolina] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [PostoGasolina] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [PostoGasolina] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [PostoGasolina] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [PostoGasolina] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [PostoGasolina] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [PostoGasolina] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [PostoGasolina] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [PostoGasolina] SET  DISABLE_BROKER 
GO
ALTER DATABASE [PostoGasolina] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [PostoGasolina] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [PostoGasolina] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [PostoGasolina] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [PostoGasolina] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [PostoGasolina] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [PostoGasolina] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [PostoGasolina] SET RECOVERY FULL 
GO
ALTER DATABASE [PostoGasolina] SET  MULTI_USER 
GO
ALTER DATABASE [PostoGasolina] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [PostoGasolina] SET DB_CHAINING OFF 
GO
ALTER DATABASE [PostoGasolina] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [PostoGasolina] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [PostoGasolina] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'PostoGasolina', N'ON'
GO
ALTER DATABASE [PostoGasolina] SET QUERY_STORE = OFF
GO
USE [PostoGasolina]
GO
/****** Object:  Table [dbo].[Abastecimento]    Script Date: 21/11/2019 17:27:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Abastecimento](
	[Nome_Vendedor] [varchar](40) NOT NULL,
	[Nome_Cliente] [varchar](40) NOT NULL,
	[Combustivel] [varchar](20) NOT NULL,
	[Qtd] [decimal](10, 3) NOT NULL,
	[Forma_Pag] [varchar](20) NOT NULL,
	[Data_Abs] [date] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Clientes]    Script Date: 21/11/2019 17:27:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Clientes](
	[Matricula] [int] IDENTITY(1,1) NOT NULL,
	[Nome] [varchar](40) NOT NULL,
	[CPF] [nchar](14) NOT NULL,
	[DataNasc] [date] NOT NULL,
	[Abastecimentos] [int] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Estoque]    Script Date: 21/11/2019 17:27:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Estoque](
	[Combustivel] [varchar](4) NOT NULL,
	[Qtd] [decimal](10, 3) NOT NULL,
	[Preco] [float] NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Funcionarios]    Script Date: 21/11/2019 17:27:52 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Funcionarios](
	[Matricula] [int] NOT NULL,
	[NvAcesso] [varchar](13) NOT NULL,
	[Nome] [varchar](40) NOT NULL,
	[Senha] [varchar](30) NOT NULL,
	[CPF] [nchar](14) NOT NULL,
	[DataNasc] [date] NOT NULL,
	[Sexo] [varchar](9) NOT NULL,
	[ImgPerfil] [image] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
USE [master]
GO
ALTER DATABASE [PostoGasolina] SET  READ_WRITE 
GO
