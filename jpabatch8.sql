-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 01 Apr 2021 pada 12.13
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jpabatch8`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `plot_mata_kuliah`
--

CREATE TABLE `plot_mata_kuliah` (
  `id_matakuliah` bigint(20) NOT NULL,
  `nim` bigint(20) NOT NULL,
  `id_dosen` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `plot_mata_kuliah`
--
ALTER TABLE `plot_mata_kuliah`
  ADD KEY `FK3ahsfjp1ps9uxj3ypcf2njgfv` (`nim`),
  ADD KEY `FKmaqmb2aopcspvrsomkc1iiid8` (`id_matakuliah`),
  ADD KEY `FKqftn4db8rdya7afgu757rscge` (`id_dosen`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
