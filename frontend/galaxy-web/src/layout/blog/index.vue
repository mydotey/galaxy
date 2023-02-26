<script setup>
import { Navbar } from './components'
import { AppMain } from './components'
import { Sidebar } from './components'
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
