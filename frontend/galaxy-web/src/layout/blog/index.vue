<script setup>
import { Navbar, AppMain, Sidebar } from './components'
</script>

<template>
  <div class="app-wrapper">
    <div class="main-container">
      <Navbar />
      <AppMain />
    </div>
    <Sidebar />
  </div>
</template>
